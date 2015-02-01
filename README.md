# eCommerce System SOA
Demonstration of service-oriented architecture (SOA) over eCommerce system.

## Implemented Features
1. High Availability - Web or application server level - each service should be supported on at least 2 node instances. Database level- replicate the database on at least 2 node instances.
2. High Performance - Distributed caching. Memcached is a good option for implementing a distributed caching mechanism.
3. Scalability - Database sharding. The database should be broken into at least 2 shards.
4. Client-Server Communication Encryption - Encrypt the communication channel between the client and server using TLS/SSL
5. Request/Response Compression - Compression (e.g. gzip) of the client request and server response
6. Authentication/Authorization - the website should be protected by a username/password or secret based service request authentication and authorization module.
7. Asynchronous Services - Supported services should be asynchronous. This can be implemented either using AJAX or performed using request/response queuing techniques.

## Note
Basic working code taken from [ECommerceSystem](https://github.com/phoenixjiangnan/ECommerceSystem). Implemented SOAP based web services over it.

## License

MIT: http://vineetdhanawat.mit-license.org/