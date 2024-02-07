CREATE ROLE vlifedbuser;

CREATE SCHEMA vlifeschema;

GRANT ALL PRIVILEGES ON DATABASE vlifedb TO vlifedbuser;

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA vlifeschema TO vlifedbuser;