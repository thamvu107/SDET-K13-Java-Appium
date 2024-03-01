package src.lessons.lesson_10.P01_EmployeeCastingVersion;

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
