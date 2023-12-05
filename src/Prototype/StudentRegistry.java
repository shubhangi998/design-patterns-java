package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map <String,Student> registry = new HashMap<String, Student>();
    public void register(String key, Student student){
        registry.put(key,student);
    }
    public Student get(String key){
        return registry.get(key);
    }
}
