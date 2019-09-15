<#import "/spring.ftl" as spring/>

<#macro select path>	
	 
	 <blog>
		<@spring.formInput "${path}"/>
	 </blog>
</#macro>