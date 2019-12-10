class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        PhoneStore phoneStore = new PhoneStore();
        Phone chinesePhone = phoneStore.orderPhone("Chinese");
        Phone americanPhone = phoneStore.orderPhone("American");
        Phone russianPhone = phoneStore.orderPhone("Russian");
    }
}

abstract class PhoneFactory {

    abstract Phone createPhone(String type);

    Phone orderPhone(String type) throws InterruptedException {
        Phone phone = createPhone(type);
        if (phone == null) {
            System.out.println("Sorry, we are not able to create this kind of phone\n");
            return null;
        }
        System.out.println("Making a " + phone.getName());
        phone.attachCamera();
        phone.attachDisplay();
        Thread.sleep(1500L);
        System.out.println("Done a " + phone.getName() + "\n");
        return phone;
    }
}

class PhoneStore extends PhoneFactory {
    @Override
    Phone createPhone(String type) {
        switch (type) {
            case "Chinese":
                return new ChinesePhone("Chinese Phone");
            case "American":
                return new AmericanPhone("American Phone");
            case "Russian":
                return new RussianPhone("Russian Phone");
            default:
                return null;
        }
    }
}

abstract class Phone {
    private String name;

    Phone(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void attachCamera() {
        System.out.println("Attaching camera");
    }

    void attachDisplay() {
        System.out.println("Attaching display");
    }
}

class ChinesePhone extends Phone {
    ChinesePhone(String name) {
        super(name);
    }
}

class AmericanPhone extends Phone {
    AmericanPhone(String name) {
        super(name);
    }
}

class RussianPhone extends Phone {
    RussianPhone(String name) {
        super(name);
    }
}