public static void moveRobot(Robot robot,int toX,int toY){
        int distanceX = toX-robot.getX();
        int distanceY = toY-robot.getY();
        if(distanceX > 0){
        while(robot.getDirection() != Direction.RIGHT){
        robot.turnRight();
        }
        }else if(distanceX < 0){
        while(robot.getDirection() != Direction.LEFT){
        robot.turnLeft();
        }
        }
        while(robot.getX()!=toX){
        robot.stepForward();
        }
        if(distanceY > 0){
        while(robot.getDirection() != Direction.UP){
        robot.turnRight();
        }
        }else if(distanceY < 0){
        while(robot.getDirection() != Direction.DOWN){
        robot.turnLeft();
        }

        }
        while(robot.getY()!=toY){
        robot.stepForward();
        }
        }