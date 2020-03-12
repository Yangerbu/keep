layui.define('table',function(exports){
	var table=layui.table;
	table.render({
		elem : '#meterial',
		height : 473,
		url : '/mechine/getMechineTableInfo' //数据接口
		,
		toolbar: '#toolbarDemo',
		page : true //开启分页
		,
		cols : [ [ //表头
			{type: 'checkbox'},	
		{
			field : 'id',
			title : 'ID',
			width : 80,
			sort : true
		}, {
			field : 'name',
			title : '器械名',
			width : 80
		}, {
			field : 'nums',
			title : '数量',
			width : 80,
			sort : true
		}, {
			field : 'price',
			title : '价格',
			width : 80
		}, {
			field : 'inTime',
			title : '进货时间',
			width : 177
		}, {
			field : 'fixTime',
			title : '维修时间',
			width : 180,
			sort : true
		}, {
			field : '',
			title : '操作',
			width : 180,
			toolbar : '#barDemo'
		}
		] ],
	
	});
	//监听
	table.on('tool(test)', function(res) {
		console.log(res);
		if (res.event === 'edit') {
			layer.open({
				type : 2,
				title : '修改',
				maxmin : true,
				closeBtn : 1,
				shadeClose : true, //点击遮罩关闭层
				area : [ '600px', '320px' ],
				content : 'update'
			});

		}

	})
	exports('mterial');
});



