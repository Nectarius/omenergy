FROM golang:1.21-alpine AS builder

COPY ${PWD} /app
WORKDIR /app

RUN CGO_ENABLED=0 go build -ldflags '-s -w -extldflags "-static"' -o /app/appbin *.go

FROM alpine:latest

RUN addgroup -S demo && adduser -S demo -G demo
USER demo



COPY --from=builder /app /home/demo/app
WORKDIR /home/demo/app


EXPOSE 2560
CMD ["./appbin"]
