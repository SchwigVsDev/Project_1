document.getElementById("Form").onsubmit = (e) => {
    e.preventDefault();
    
    window.alert(
        "Username: " + document.getElementById("Username").value
        + "\nPassword: " + document.getElementById("Password").value
        + "\nRemeber me?: " + document.getElementById("Remeber").checked
    );
}