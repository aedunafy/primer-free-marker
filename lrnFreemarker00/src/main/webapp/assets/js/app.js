Vue.component('blog', { 
	props: ['postTitle'],
	data: function(){
		return{}
	},
	template: `
		 <span>
		 	<slot></slot>
		 </span>
	     `
})

new Vue({ el: '#__app__' })