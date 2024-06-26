/** @type {import('tailwindcss').Config} */
module.exports = {
  purge: ['./index.html', './src/**/*.{vue,js,ts,jsx,tsx}'],
  content: [],
  theme: {
    extend: {
      colors: {
        primary: 'black',
        secondary: 'white',
      },
      fontFamily: {
        serif: ['serif'],
      },
      fontSize: {
        '2xl': '5rem',
      },
    },
  },
  plugins: [],
}

