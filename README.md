# apigateway_consul
API gateway using springboot(Zuul API Gateway/Consul(Service discovery/Property configuration)

#Consul Config
Setting up of properties in consul requires the following steps

1.Access consul server http://localhost:8500/ui/dc1/kv (change the host:port based on env)
2.click create key and type in the following config/yourapplicationname/propertypath/property
incase of this application the key would be config/zuul-api-gateway/applicationconfig/properties

You can change the properties and hot reload without server downtime.


#Service Discovery
you can change the route forward properties in application yml 
using URL or serviceID of the registered service in Consul.


