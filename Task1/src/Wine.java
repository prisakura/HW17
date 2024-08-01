import java.time.LocalDate;
import java.time.Period;

public class Wine {
private Specs sort;
private String name;
private Trademarks trademark;
private String description;
private LocalDate datebottling;

    public Wine(Specs sort, String name, Trademarks trademark, String description, LocalDate datebottling) {
        this.sort = sort;
        this.name = name;
        this.trademark = trademark;
        this.description = description;
        this.datebottling = datebottling;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "sort=" + sort +
                ", name='" + name + '\'' +
                ", trademark=" + trademark +
                ", description='" + description + '\'' +
                ", datebottling=" + datebottling +
                '}';
    }

    public String getAllWineInfo() {
        return "Название: "+this.name+"\n"+"Сорт: "+this.sort.getNameValue()+"; Цвет: "+this.sort.getColor()+"\n"+"Торговая марка: "+this.trademark.getFullInfo()+"\n"+"Описание: "+this.description+"\n"+"Дата розлива: "+this.datebottling.getYear();
    }

    public Wine() {
    }

    public Specs getSort() {
        return sort;
    }

    public void setSort(Specs sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trademarks getTrademark() {
        return trademark;
    }

    public void setTrademark(Trademarks trademark) {
        this.trademark = trademark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDatebottling() {
        return datebottling;
    }

    public void setDatebottling(LocalDate datebottling) {
        this.datebottling = datebottling;
    }

    public int getAging(LocalDate date){

        return Period.between(this.datebottling,date).getYears();

    }
}
