package KS_2

fun main(){
    val numberOfPermanentEmployees = 50
    val numberOfTrainees = 30
    val totalNumberOfEmployees = numberOfTrainees + numberOfPermanentEmployees
    val permanentEmployees = numberOfPermanentEmployees * SALARY_OF_PERMANENT_EMPLOYEES
    val generalSalaryExpenses = permanentEmployees + numberOfTrainees * TRAINEE_SALARY
    val averageSalaryOfEachEmployee = generalSalaryExpenses / totalNumberOfEmployees

    println(permanentEmployees)
    println(generalSalaryExpenses)
    println(averageSalaryOfEachEmployee)
}
const val SALARY_OF_PERMANENT_EMPLOYEES = 30000
const val TRAINEE_SALARY = 20000