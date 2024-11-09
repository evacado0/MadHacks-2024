function addTask(){
    resetTask();
    const taskTitle = document.getElementById("new-task-title").value;
    const taskDescription = document.getElementById("new-task-description").value;
    const taskCategory = document.getElementById("new-task-category").value;
    if(taskTitle == ""){
        document.getElementById("title-error-text").innerText = "Please enter a task title!";
        if(taskDescription == ""){
            document.getElementById("description-error-text").innerText = "Please enter a task desciption!";
        }
    }
    else if(taskDescription == ""){
        document.getElementById("description-error-text").innerText = "Please enter a task desciption!";
    }
    else{
        resetTask();
        alert(`your task title: ${taskTitle}
        your task description: ${taskDescription}
        your task category: ${taskCategory}
            `);
    }
}

function resetTask() {
    document.getElementById("title-error-text").innerText = "";
    document.getElementById("description-error-text").innerText = "";
    document.getElementById("category-error-text").innerText = "";

}