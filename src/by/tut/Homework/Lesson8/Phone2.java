package by.tut.Homework.Lesson8;

public class Phone2 {
    private String model = "Samsung";
    private int number = 5353535;
    private int weight = 300;
    private String receiveCall = number + " Masha";

    {
        System.out.println("Звонит " + receiveCall);
    }

    private String sendMessage;

    {
        System.out.println("Message" + number);
    }

    public Phone2() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getReceiveCall() {
        return receiveCall;
    }

    public void setReceiveCall(String receiveCall) {
        this.receiveCall = receiveCall;
    }

    public String getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", weight=" + weight +
                ", receiveCall='" + receiveCall + '\'' +
                ", sendMessage='" + sendMessage + '\'' +
                '}';
    }

    public Phone2(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public Phone2(String model, int number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }
}