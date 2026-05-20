FROM mysql:8.4
ENV MYSQL_ROOT_PASSWORD=admin123
ENV MYSQL_DATABASE=perfumeria_db
ENV MYSQL_USER=alumno
ENV MYSQL_PASSWORD=alumno123
COPY init.sql /docker-entrypoint-initdb.d/init.sql
EXPOSE 3306
