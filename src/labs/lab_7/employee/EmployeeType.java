package src.labs.lab_7.employee;

enum EmployeeType {
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
