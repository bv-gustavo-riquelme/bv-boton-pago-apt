package cl.bicevida.object;

public class DataBanco {
    private String value;
    private String name;
    private String type;
    
    public DataBanco() {
        super();
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
