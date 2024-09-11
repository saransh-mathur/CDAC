public class InstanceCounter {

    private static int instanceCount = 0;
    private String name;
    static {
        instanceCount = 0;  
    }
    public InstanceCounter(String name) {
        this.name = name;
        instanceCount++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "InstanceCounter{name='" + name + "'}";
    }
    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter("Object1");
        InstanceCounter obj2 = new InstanceCounter("Object2");
        InstanceCounter obj3 = new InstanceCounter("Object3");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println("Total instances created: " + InstanceCounter.getInstanceCount());
    }
}
