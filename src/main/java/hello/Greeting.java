package hello;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String sayHello() {
        return "Hello world say!";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
