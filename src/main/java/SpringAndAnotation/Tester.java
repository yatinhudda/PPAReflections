package SpringAndAnotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class JsonSerialzableException extends Exception{

}

public class Tester {

    //Should create an annotation
    public static void main(String[] args) throws JsonSerialzableException {
        Person person = new Person("Yatender", "Hudda", "24", "Meerut");
        String myJsonString = convertToJson(person);
        System.out.println(myJsonString);
    }

    private static void checkIfSerialiable(Object object) throws JsonSerialzableException {
        if(Objects.isNull(object)){
            throw new JsonSerialzableException();
        }

        Class<?> cls = object.getClass();
        if(!cls.isAnnotationPresent(JsonSerialized.class)){
            throw new JsonSerialzableException();
        }
    }

    private static void runStringMethod(Object object) throws InvocationTargetException, IllegalAccessException {
        Class<?> cls = object.getClass();

        for(Method method : cls.getDeclaredMethods()){
            if(method.isAnnotationPresent(StringAnnotation.class)){
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    private static String getJsonString(Object object) throws IllegalAccessException {
         Map<String, String> jsonMap = new HashMap<>();
        Class<?> cls = object.getClass();

        for(Field field : cls.getDeclaredFields()){
            field.setAccessible(true);
            if(field.isAnnotationPresent(JsonElement.class)){
                jsonMap.put(field.getName(), (String)field.get(object));
            }
        }

        StringBuffer convertedJson = new StringBuffer();

        jsonMap.forEach((key, value)->{
            convertedJson.append("\"" + key + "\":\"" +  value + "\"");
            convertedJson.append(",");
        });


        return "{" + convertedJson.substring(0, convertedJson.length() - 1) + "}";
    }

    public static String convertToJson(Object object) throws JsonSerialzableException {
        try{
            checkIfSerialiable(object);
            runStringMethod(object);
            return getJsonString(object);

        }catch(Exception e){
            throw new JsonSerialzableException();
        }
    }
}
