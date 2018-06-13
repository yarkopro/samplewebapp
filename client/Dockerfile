FROM node:7
RUN mkdir -p /app
WORKDIR /app
COPY package.json /app/package.json
RUN npm install
COPY . /usr/src/app
EXPOSE 4200
CMD ["npm", "start", "start"]
