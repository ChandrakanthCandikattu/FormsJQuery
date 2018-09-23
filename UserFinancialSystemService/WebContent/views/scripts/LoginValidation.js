/**
 * 
 */
$(document).ready(()=>{
	$("#frm1").validate({
        rules:{
            "userId.userName":{
            	required : true
            },
            "passWord":{
            	required : true
            }
        },
        messages: {
        	 "userId.userName":{
        		 required : "User name cannot be empty"
        	 },
        	 "passWord":{
             	required : "Password cannot be empty"
             }
        },
       errorElement : "span",
       errorPlacement : (error, element)=>{
    	   						if(element.attr("name") == "userId.userName"){
									   $("#err1").html(error);
    	   						}
    	   						else{
									   $("#err2").html(error);
    	   						};
       						},
       submitHandler: (form)=>{
    	   $.ajax({
    		   		url: "/existingUser/2",
    		   		success: (response)=>{ 
    		   			$.each(response, (i, resp)=>{console.log(resp)});
    		   		}
    		   		
    	   });
    	   $(form).ajaxSubmit();
       }
    });
	
});
