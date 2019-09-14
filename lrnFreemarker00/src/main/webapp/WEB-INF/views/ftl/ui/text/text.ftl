<#import "/spring.ftl" as spring/>

<#macro text value>
	<@spring.formInput "${value}"/>
</#macro>