package src.lessons.lesson10.p02.controlModel;

public enum EmployeeType {
    FULL_TIME("Full time employee"),
    CONTRACT("Contract employee");
    private String typeDescription;

    EmployeeType(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getTypeDescription() {
        return typeDescription;
    }
}
