# EXAMPLE MYBATIS PAGINATION

This repository contains a simple example pagination using mybatis

The enpoint will get all the products and send some parameters as part
of the url page and size 

The request example can be like

```
http://localhost:8080/products?page=3&size=10
```

The response example has the page number and a item list

```
{
	"page": 3,
	"users": [
		{
			"id": 21,
			"name": "TV 20",
			"status": true
		},
		{
			"id": 22,
			"name": "TV 21",
			"status": true
		},
		{
			"id": 23,
			"name": "TV 22",
			"status": true
		},
		{
			"id": 24,
			"name": "TV 23",
			"status": true
		}
	]
}
```
