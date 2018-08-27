package am.mainserver.jsfexample;


import javax.inject.Named;

@Named
public class ExampleBean {


    private String text = "CDI example";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
