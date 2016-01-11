
var toolbar = [{
	    text:'记帐',
	    iconCls:'icon-add',
	    handler:function(){alert('add')}
	},'-',{
	    text:'修改',
	    iconCls:'icon-edit',
	    handler:function(){alert('cut')}
	},'-',{
	    text:'删除',
	    iconCls:'icon-remove',
	    handler:function(){alert('save')}
	}];

var columns = [[
    {field:'time',title:'日期',width:100},
    {field:'type',title:'类型',width:100},
    {field:'account-type',title:'帐目分类',width:100,align:'right'},
    {field:'money',title:'金额',width:100},
    {field:'remark',title:'备注',width:100}
]];

$(function(){
	// detail
	$('#dg').datagrid({
	    url:'../tally/getDetailsData',
	    fit:true,
	    loadMsg: '数据正在加载,请耐心的等待...' ,
	    pagination: true , 
		pageSize: 10 ,
		pageList:[5,10,15,20,50] ,
		toolbar : toolbar,
	    columns:columns
	});
})

