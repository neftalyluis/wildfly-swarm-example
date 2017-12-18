package mx.neftaly.swarmprueba.rest;

public class TestJson {

    private String name;
    private Long telephone;

    public TestJson(String name, Long telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }
}
