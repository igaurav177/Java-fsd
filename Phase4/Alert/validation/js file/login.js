function checkvalidationOfForm(){
    let name=document.f1.user.value;
    console.log("the name is entered is "+name)
    let pass=document.f1.pwd.value;
    console.log("the pwd is entered is "+pass)
 
    if(name=="" && pass==""){
        alert("field should not be empty")
    }
    else if(name==""){
       alert("name should not be empty ")
    }
    else if(pass==""){
       alert("password must not be empty")
    }
    else if(name==="admin" && pass==="admin"){
       document.write("Hey Welcome "+name)
    }
    else{
       alert("please check credentials ")
    }
 
 
   }