public class Polymorphic{
    public static void main(String[] args) {

        Animal any = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        any = dog;   //auto type tranform
        any.eat();
        dog.eat();
        cat.eat();
        // cat.play();     Error : The method play() is undefined for the type Animal 
        if(any instanceof Dog){
           Dog dog2 = (Dog)any;
        }else{
            System.out.println("can't from any to Dog");
        }
        
        if(any instanceof Cat){
            Cat cat2 = (Cat)any;
         }else{
             System.out.println("can't from any to Cat");
         }
         
    }
}

class Animal{
    public void eat(){
        System.out.println("animal can eat food");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("dog like meat");
    }
}

class Cat extends Animal{
    public void play(){
        System.out.println("cat  like play");
    }
}