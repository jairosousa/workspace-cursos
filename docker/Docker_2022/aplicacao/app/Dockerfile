FROM node:12-alpine

WORKDIR /app

RUN addgroup dev && adduser -S -G jairo dev

USER jairo

COPY . .

RUN apk add --no-cache python2 g++ make

RUN yarn install --production

CMD [ "node", "src/index.js" ]

EXPOSE 3000

