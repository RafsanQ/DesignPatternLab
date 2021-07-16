public class strikeOutDecorator extends Decorator {

    public strikeOutDecorator(Subject subject){
        this.subject = subject;
    }

    public String getOutput(){

        return "<del>" + subject.getOutput() + "</del>";
    }

}
