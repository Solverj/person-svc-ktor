# person-svc-ktor
solve@solve ~/git-repositories/Hobby/ktor $ ab -n 100000 -c 100 http://localhost:8080/persons
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 10000 requests
Completed 20000 requests
Completed 30000 requests
Completed 40000 requests
Completed 50000 requests
Completed 60000 requests
Completed 70000 requests
Completed 80000 requests
Completed 90000 requests
Completed 100000 requests
Finished 100000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8080

Document Path:          /persons
Document Length:        361 bytes

Concurrency Level:      100
Time taken for tests:   32.476 seconds
Complete requests:      100000
Failed requests:        7
   (Connect: 0, Receive: 0, Length: 7, Exceptions: 0)
Total transferred:      45497508 bytes
HTML transferred:       36097508 bytes
Requests per second:    3079.24 [#/sec] (mean)
Time per request:       32.476 [ms] (mean)
Time per request:       0.325 [ms] (mean, across all concurrent requests)
Transfer rate:          1368.14 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    1   1.0      0      27
Processing:     1   32  19.7     29     114
Waiting:        1   31  19.6     29     114
Total:          1   32  19.6     30     115

Percentage of the requests served within a certain time (ms)
  50%     30
  66%     39
  75%     45
  80%     49
  90%     58
  95%     69
  98%     80
  99%     87
 100%    115 (longest request)
solve@solve ~/git-repositories/Hobby/ktor $ ab -n 100000 -c 100 http://localhost:8080/
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 10000 requests
Completed 20000 requests
Completed 30000 requests
Completed 40000 requests
Completed 50000 requests
Completed 60000 requests
Completed 70000 requests
Completed 80000 requests
Completed 90000 requests
Completed 100000 requests
Finished 100000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8080

Document Path:          /
Document Length:        32 bytes

Concurrency Level:      100
Time taken for tests:   11.815 seconds
Complete requests:      100000
Failed requests:        6
   (Connect: 0, Receive: 0, Length: 6, Exceptions: 0)
Total transferred:      12599838 bytes
HTML transferred:       3199838 bytes
Requests per second:    8464.07 [#/sec] (mean)
Time per request:       11.815 [ms] (mean)
Time per request:       0.118 [ms] (mean, across all concurrent requests)
Transfer rate:          1041.46 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    3   1.4      3      10
Processing:     0    9   6.1      7      59
Waiting:        0    8   6.1      5      58
Total:          0   12   6.0     10      60

Percentage of the requests served within a certain time (ms)
  50%     10
  66%     12
  75%     13
  80%     15
  90%     19
  95%     24
  98%     29
  99%     34
 100%     60 (longest request)
