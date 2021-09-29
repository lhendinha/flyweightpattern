public class RailwayTicket implements Ticket {
    private String type;
    private int fare;
    private String name;

    public RailwayTicket(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setFare(int fare){
        this.fare = fare;
    }

    public String getName() {
        return this.name;
    }

    public int getFare() {
        return this.fare;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void getTicketInfo(){
        System.out.println("--------Display ticket info--------");
        System.out.println("Name : "+ name + "\nTicket Type : "
                + type + "\nFare : " + fare + "\n");
    }
}