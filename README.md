# Parfum Perfumería - Proyecto Semestral DevOps

Proyecto adaptado desde el archivo **Proyecto Semestral** para una perfumería. La solución usa:

- Frontend React/Vite servido por Nginx.
- Backend Ventas Spring Boot en puerto 8080.
- Backend Despachos Spring Boot en puerto 8081.
- MySQL en EC2-Data, con usuario `alumno` y contraseña `alumno123`.
- Dockerfiles propios para cada servicio.
- Workflows GitHub Actions para build, push a ECR y deploy por SSM.

## IPs mantenidas para AWS

- EC2-App: `10.0.143.206`
- EC2-Data: `10.0.157.155`
- DB: `perfumeria_db`
- Usuario DB: `alumno`
- Password DB: `alumno123`

## Servicios Docker esperados

- `parfum-frontend` en EC2-Web puerto `80:80`
- `parfum-ventas` en EC2-App puerto `8080:8080`
- `parfum-despachos` en EC2-App puerto `8081:8081`
- `parfum-db` en EC2-Data puerto `3306:3306`

## ECR sugeridos

Crear estos repositorios en ECR:

- `parfum-frontend`
- `parfum-ventas`
- `parfum-despachos`
- `parfum-db`

## Secrets sugeridos en GitHub

- `AWS_ACCESS_KEY_ID`
- `AWS_SECRET_ACCESS_KEY`
- `AWS_SESSION_TOKEN`
- `AWS_REGION`
- `ECR_REGISTRY`
- `ECR_REPO_URL_FRONTEND`
- `ECR_REPO_URL_VENTAS`
- `ECR_REPO_URL_DESPACHOS`
- `ECR_REPO_URL_DB`
- `EC2_FRONTEND_INSTANCE_ID`
- `EC2_BACKEND_INSTANCE_ID`
- `EC2_DB_INSTANCE_ID`

## Prueba local opcional

```bash
docker compose up --build
```

Luego abrirr:

```text
http://localhost
```
