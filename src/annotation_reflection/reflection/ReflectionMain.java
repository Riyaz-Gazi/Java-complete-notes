package annotation_reflection.reflection;

import java.lang.reflect.*;

class Eagle {
    public String breed;
    private boolean canSwim;
    private Eagle(){
    }
    public void fly() {
        System.out.println("fly");
    }

    private void eat() {
        System.out.println("eat");
    }
}

public class ReflectionMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));

        System.out.println("----------");

        Method[] methods = eagleClass.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(method.getDeclaringClass());
            System.out.println("***********************");
        }

        Field[] declaredFields = eagleClass.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println(field.getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getType());
            System.out.println("$$$$$$$$$$$$$$");
        }


        Object eagle = eagleClass.newInstance();
        Field field = eagleClass.getDeclaredField("canSwim");
        field.setAccessible(true);
        field.set(eagle,false);
        System.out.println(field.getBoolean(eagle));

        Constructor[] declaredConstructors = eagleClass.getDeclaredConstructors();
        for(Constructor constructor:declaredConstructors){
            constructor.setAccessible(true);
            Eagle eagle1 = (Eagle) constructor.newInstance();
            eagle1.fly();
        }

    }
}
