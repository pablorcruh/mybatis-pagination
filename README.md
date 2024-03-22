# EXAMPLE MYBATIS PAGINATION

This repository contains a simple example pagination using mybatis

The enpoint will get all the products and send some parameters as part
of the url page and size 

The request example can be like

```
http://localhost:8080/products?page=1&size=5
```

The response example has the page number and a item list

```
{
	"pagination": [
		{
			"size": 5,
			"page": 1
		}
	],
	"products": [
		{
			"id": 1,
			"name": "TV",
			"status": true
		},
		{
			"id": 2,
			"name": "TV 1",
			"status": true
		},
		{
			"id": 3,
			"name": "TV 2",
			"status": true
		},
		{
			"id": 4,
			"name": "TV 3",
			"status": true
		},
		{
			"id": 5,
			"name": "TV 4",
			"status": true
		}
	]
}
```
