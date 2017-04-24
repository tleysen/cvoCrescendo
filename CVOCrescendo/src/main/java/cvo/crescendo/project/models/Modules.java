package cvo.crescendo.project.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Alexander on 21/04/2017.
 */
public class Modules {

    private String id;
    private String exchangeCode;
    private String code;
    private String name;
    private String moduleCode;

    public Modules() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "id='" + id + '\'' +
                ", exchangeCode='" + exchangeCode + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", moduleCode='" + moduleCode + '\'' +
                '}';
    }
}
