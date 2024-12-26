package OOPS;

class GrandFather{
    public void grandFather(){
        System.out.println("GrandFather");
    }
}

class Father extends GrandFather{
    public void father(){
        System.out.println("Father");
    }
}

class Son extends Father{
    public void son(){
        System.out.println("Son");
    }
}

class Daughter extends Father{
    public void daughter(){
        System.out.println("Daughter");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Son s = new Son();
        s.son();
        s.father();
        s.grandFather();
        
        Daughter d = new Daughter();
        d.daughter();
        d.father();
        d.grandFather();
        
    }

    
}
