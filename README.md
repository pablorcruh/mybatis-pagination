# EXAMPLE MYBATIS PAGINATION

This repository contains a simple example pagination using mybatis

The enpoint will get all the products and send some parameters as part
of the url page and size 

The request example can be like

```
http://localhost:8080/products?page=2&size=10
```

The response example has the page number and a item list

```
{
	"page": 2,
	"users": [
		{
			"id": 11,
			"name": "TV 10",
			"status": true
		},
		{
			"id": 12,
			"name": "TV 11",
			"status": true
		},
		{
			"id": 13,
			"name": "TV 12",
			"status": true
		},
		{
			"id": 14,
			"name": "TV 13",
			"status": true
		},
		{
			"id": 15,
			"name": "TV 14",
			"status": true
		},
		{
			"id": 16,
			"name": "TV 15",
			"status": true
		},
		{
			"id": 17,
			"name": "TV 16",
			"status": true
		},
		{
			"id": 18,
			"name": "TV 17",
			"status": true
		},
		{
			"id": 19,
			"name": "TV 18",
			"status": true
		},
		{
			"id": 20,
			"name": "TV 19",
			"status": true
		}
	]
}
```
