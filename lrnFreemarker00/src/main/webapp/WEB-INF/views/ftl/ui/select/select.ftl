<#import "/spring.ftl" as spring/>

<#macro select value>
	<@spring.formInput "${value}"/>
</#macro>