layui.define('table',function(exports){
	var table=layui.table;
	table.render({
		elem : '#classes',
		height : 530,
		url : '/classes/getClassesTableInfo' //数据接口
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
			field : 'className',
			title : '课程名',
			width : 80
		}, {
			field : 'teacher',
			title : '教练',
			width : 80,
			sort : true
		}, {
			field : 'classTime',
			title : '课时',
			width : 80
		}, {
			field : 'nums',
			title : '课程数',
			width : 177
		}, {
			field : 'price',
			title : '课程价格',
			width : 180,
			sort : true
		}, {
			field : '',
			title : '操作',
			width : 312,
			toolbar : '#barDemo'
		}
		] ],
	
	});
	//监听
	table.on('tool(classes)', function(res) {
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
	exports('classes');
});



