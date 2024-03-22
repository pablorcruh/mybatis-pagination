# EXAMPLE MYBATIS PAGINATION

This repository contains a simple example pagination using mybatis

The enpoint will get all the products and send some parameters as part
of the url page and size 

The request example can be like

## Request with empty filter
```
http://localhost:8080/products?page=1&size=5&filter
```
The response example has the pagination object and a item list
```
{
	"pagination": [
		{
			"size": 5,
			"page": 1,
			"totalPages": 4
		}
	],
	"products": [
		{
			"id": 1,
			"name": "Smartphone",
			"description": "High-end smartphone with advanced features",
			"status": true
		},
		{
			"id": 2,
			"name": "Laptop",
			"description": "Thin and light laptop with powerful performance",
			"status": true
		},
		{
			"id": 3,
			"name": "Smart TV",
			"description": "4K Ultra HD Smart TV with built-in streaming apps",
			"status": true
		},
		{
			"id": 4,
			"name": "Wireless Earbuds",
			"description": "True wireless earbuds with noise cancellation",
			"status": true
		},
		{
			"id": 5,
			"name": "Gaming Console",
			"description": "Next-gen gaming console for immersive gaming experience",
			"status": true
		}
	]
}
```

## Request with filter using search terms
```
http://localhost:8080/products?page=1&size=5&filter=Watch
```

The response example has the pagination object and a item list
```
{
	"pagination": [
		{
			"size": 5,
			"page": 1,
			"totalPages": 1
		}
	],
	"products": [
		{
			"id": 7,
			"name": "Smart Watch",
			"description": "Fitness tracker and smartwatch with heart rate monitoring",
			"status": true
		}
	]
}
```
