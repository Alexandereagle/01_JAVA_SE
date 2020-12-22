public enum SeasonEnum {

    SPRING("春天", "万物复苏"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "北风那个吹");
    private final String seasonName;
    private final String desc;

    private SeasonEnum(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "seasonName='" + seasonName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

class TestSeasonEnum{
    public static void main(String[] args) {
        System.out.println(SeasonEnum.valueOf("SPRING"));
    }
}