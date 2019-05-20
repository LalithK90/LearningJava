package Method.HowToCallPrivateMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallPrivateMethodDemo {
    //Reflection API

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class cs =  Class.forName("Method.HowToCallPrivateMethod.Test");
        Test test = (Test) cs.newInstance();

        Method method = cs.getDeclaredMethod("show", null);
        method.setAccessible(true);
        method.invoke(test, null);
    }
}

