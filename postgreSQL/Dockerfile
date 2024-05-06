FROM postgres

COPY init.sql /docker-entrypoint-initdb.d/

ENV POSTGRES_DB=charge
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=root