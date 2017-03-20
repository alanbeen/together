$(document).ready(function(){
	
})
//页面表单值转json
function arrayToJson(id){
	var formArray = $("#"+id).serializeArray();
	console.info(formArray);
	var dataArray = {};
	  $.each(formArray,function(){
	    if(dataArray[this.name]){
	      if(!dataArray[this.name].push){
	        dataArray[this.name] = [dataArray[this.name]];
	      }
	        dataArray[this.name].push(this.value || '');
	    }else{
	      dataArray[this.name] = this.value || '';
	    }
	  });
	  return JSON.stringify(dataArray);
}
//map转json
function mapToJson(obj){
	return json = JSON.stringify(obj);
}


//获取选中的id
//function getIdSelections($table,id){
//	return JSON.stringify($.map($table.bootstrapTable('getSelections'),function(row){
//		return row.id;
//	}))
//}

