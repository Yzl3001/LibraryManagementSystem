function saveUser() {
    var url =getProjectPath()+"/user/addUser";
    $.post(url, $("#addUser").serialize(), function (response) {
        alert(response.message)
        if (response.success == true) {
            window.location.href =  getProjectPath()+"/user/search";
        }
    })
}