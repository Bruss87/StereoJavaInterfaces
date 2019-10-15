public abstract class Component {
    protected int volume;
    protected String model;

    public Component(){
        this.volume = 0;
        this.model = null;
    }

    public int getVolume(){
        return this.volume;
    }

    public String getModel(){
        return this.model;
    }

    public String setModel(String model){
        return this.model = model;
    }


}
