let employees = [];
//Add employee function
function addEmployee() {
let empName = document.getElementById("empName").value;
let empAge = document.getElementById("empAge").value;
let empSalary = document.getElementById("empSalary").value;
let empAddress = document.getElementById("empAddress").value;

let empObj = {
name: empName,
age: empAge,
salary:empSalary,
address:empAddress,
id: employees.length + 1,
};
employees.push(empObj);
showEmployees();
resetEmployeeForm();
}
//Display employees list function
function showEmployees() {
document.getElementById("employees-list").innerHTML = "";
for (let i = 0; i < employees.length; i++) {
document.getElementById("employees-list").innerHTML +=
'<li class="employee-item">' + "Id: "+
employees[i].id +
" , " + "Employee Name: "+
employees[i].name +
" , " + "Employee Age: "+
employees[i].age +
" , "+ "Employee Salary: "+
employees[i].salary+
"  "+ "Address: "+
employees[i].address+" "+"<br>"+"<br>"+
'<button class="btn1" onclick="editEmployee(' + i + ')">' + "Edit" + "</button>"+
'<button class="btn2" onclick="deleteEmployeeForm(' + i + ')">' + "Delete" + "</button>"+
"</li>";
}
}
// Reset employee form afetr submit
function resetEmployeeForm() {
document.getElementById("empName").value = "";
document.getElementById("empAge").value = "";
document.getElementById("empSalary").value = "";
document.getElementById("empAddress").value = "";
}

//Delete employees
function deleteEmployeeForm(){
    if (confirm('Are you sure to delete this record ?')) {
    employees.splice(0,1);
    resetEmployeeForm();
    showEmployees();
    }
}
function editEmployee(item){
        console.log(item);
        console.log(employees);
        console.log(employees[item]);

        document.getElementById('Edit').style.display='block';
        document.getElementById('forms').style.display='none';
        document.getElementById('EmpName').value=employees[item]['name'];
        document.getElementById('EmpAge').value=employees[item]['age'];
        document.getElementById('EmpSalary').value=employees[item]['salary'];
        document.getElementById('EmpAddress').value=employees[item]['address'];
        document.getElementById('Eid').value=employees[item]['id'];
};
// Update Employees
function updateEmployeeForm(data){
    let empName=document.getElementById("EmpName").value;
    let empAge=document.getElementById("EmpAge").value;
    let empSalary=document.getElementById("EmpSalary").value;
    let empAddress=document.getElementById("EmpAddress").value;
    let id=document.getElementById("Eid").value;

    let employees1=employees.map(function (employee){
        if(id==employee.id){
            return{
                name:empName,
                age:empAge,
                salary:empSalary,
                address:empAddress,
                id:id,
            };
        }
        else return employee;
    })
    console.log(employees1);
    employees=employees1;
    showEmployees();
    document.getElementById('Edit').style.display='none';
    document.getElementById('forms').style.display='block';
}
