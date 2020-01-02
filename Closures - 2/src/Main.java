/*
(single)->{
        return  new StringBuilder().append(prefix).append(single.trim()).append(suffix).toString();
        };*/

(element) -> prefix + element.trim()+ suffix;
