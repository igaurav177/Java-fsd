function checkvalidationOfForm(){
    let sid=document.stu.id.value;
    console.log("the student id is entered is "+sid)
    let sname=document.stu.name.value;
    console.log("the student name is entered is "+sname)
    let semail=document.stu.email.value
    console.log("the student email id entered is "+semail)
    let spwd=document.stu.password.value;
    console.log("the pwd is entered is "+spwd)
    let sgender=document.stu.gender.value;
    console.log("the student gender entered is "+sgender)
    let sfavgame= document.getElementById("favGame").value;
    console.log("the student fav game entered is "+sfavgame)
    let scourse=document.stu.course.value;
    console.log("the student fav game entered is "+scourse)
    let saddress=document.stu.address.value;
    console.log("the student fav game entered is "+saddress)

    let sidStatusofEmpty=""
    let snameStatusofEmpty=""
    let spwdStatusofEmpty=""
    let spwdlengthStatus=""
    let semailStatusofEmpty=""
    let scourseStatusofEmpty=""
    let saddressStatusofEmpty=""
    let sgenderStatusofEmpty=""
    let sfavgameStatusofEmpty=""
    let other=""
    
    if(sid==""){
        sidStatusofEmpty="id should not be empty"
    }
    if(sname==""){
       snameStatusofEmpty="name should not be empty "
    }
    if(semail==""){
        semailStatusofEmpty="email should not be empty"
    }
   if(spwd==""){
    spwdStatusofEmpty="password must not be empty"
    }
   if(spwd.length<6){
    spwdlengthStatus="password must not be <6"
    }
    if(scourse==""){
        scourseStatusofEmpty="course should not be empty"
    }
    if(sid!==""&&sname!=="" && semail!==""&&spwd!==""&&scourse!==""&&saddress!==""&&sgender!==""&&sfavgame!==""){
       document.write("Hey Welcome "+sname)
    }
    if(saddress==""){
       saddressStatusofEmpty="address should not be empty"
    }
    if(sgender==""){
        sgenderStatusofEmpty="gender should not be empty"
    }
    if(sfavgame==""){
        sfavgameStatusofEmpty="student fav game should not be empty"
    }
    else{
       other="please check credentials "
    }
    alert(sidStatusofEmpty+"\n"+snameStatusofEmpty+"\n"+spwdlengthStatus+"\n"+semailStatusofEmpty+"\n"+spwdStatusofEmpty+"\n"+scourseStatusofEmpty+"\n"+sgenderStatusofEmpty+"\n"+sfavgameStatusofEmpty+"\n"+other)
 
 
   }