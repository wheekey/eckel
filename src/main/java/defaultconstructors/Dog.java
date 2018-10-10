package defaultconstructors;

public class Dog {



    public Dog() {

    }

    public void bark()
    {
        System.out.println("gav");
    }

    public void bark(int count)
    {
        for(int i= 0; i < count; i++)
        {
            bark();
        }
    }

    public void bark(String message)
    {
        System.out.println(message);
    }

    public void bark(int count, String message)
    {
        for(int i= 0; i < count; i++)
        {
            bark(message);
        }
    }

    public void bark(String message, int count)
    {
        for(int i= 0; i < count; i++)
        {
            bark(message);
        }
    }

}
